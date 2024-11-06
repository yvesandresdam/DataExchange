using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Salto : MonoBehaviour
{
    [SerializeField] float velocidad = 1;
    [SerializeField] float velocidadSalto = 1;
    private Rigidbody2D rb;

    void Start()
    {
        rb = GetComponent<Rigidbody2D>();
    }

    void Update()
    {
        float salto = Input.GetAxis("Jump");
        if (salto > 0)
        {
            Vector3 fuerzaSalto = new Vector3(0, velocidadSalto * velocidad, 0);
            rb.AddForce(fuerzaSalto);
        }
    }

}
