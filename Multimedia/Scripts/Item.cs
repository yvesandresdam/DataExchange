using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Item : MonoBehaviour
{
    private SceneController sceneController;
    void Start()
    {
        sceneController = FindAnyObjectByType<SceneController>();
    }


    void Update()
    {

    }

    private void OnTriggerEnter2D(Collider2D collision)
    {
        if (collision.tag == "Personaje")
        {
            sceneController.AddPoints(10);
            sceneController.AnotarItemRecogido();
            Destroy(gameObject);
        }
    }




}
