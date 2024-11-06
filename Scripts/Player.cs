using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Player : MonoBehaviour
{
    private float xInicial, yInicial;
    

void Start()
    {
        xInicial = transform.position.x;
        yInicial = transform.position.y;
    }


    void Update()
    {
        
    }

    public void Recolocar()
    {
        transform.position = new Vector3(xInicial, yInicial, 0);
    }
}
