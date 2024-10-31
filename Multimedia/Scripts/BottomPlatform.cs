using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class BottomPlatform : MonoBehaviour
{
    void Start()
    {

    }
    void Update()
    {

    }

    private void OnTriggerEnter2D(Collider2D collision)
    {
        //FindObjectOfType<Player>().SendMessage("Recolocar");
        // También podríamos hacerlo así:
        Player player = collision.gameObject.GetComponent<Player>();
        player.Recolocar();
    }
}
