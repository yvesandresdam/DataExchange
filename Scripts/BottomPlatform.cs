using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class BottomPlatform : MonoBehaviour
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
        //FindObjectOfType<Player>().SendMessage("Recolocar");
        // También podríamos hacerlo así:
        Player player = collision.gameObject.GetComponent<Player>();
        sceneController.PerderVida();
        player.Recolocar();
    }
}
