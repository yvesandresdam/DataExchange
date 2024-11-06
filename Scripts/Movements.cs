using System.Collections;
using System.Collections.Generic;
using UnityEditor.Tilemaps;
using UnityEngine;

public class Movements : MonoBehaviour
{
    [SerializeField] float velocity;
    private float horizontalMove;
    private Animator animator;
    private SpriteRenderer spriteRenderer;

    void Start()
    {        
        animator = gameObject.GetComponent<Animator>();
        spriteRenderer = gameObject.GetComponent<SpriteRenderer>();
    }


    void Update()
    {
        float horizontalMovement = Input.GetAxis("Horizontal");
        transform.Translate(horizontalMovement * velocity * Time.deltaTime, 0, 0);

        if (horizontalMovement > 0.1f || horizontalMovement < -0.1f)
        {
            if (horizontalMovement < 0)
            {
                Flip(false);
            }
            else if (horizontalMovement > 0)
            {
                Flip(true);
            }
            animator.Play("moving");
        }
    }

    void Flip(bool facingLeft)
    {
        spriteRenderer.flipX = facingLeft;
    }
}
