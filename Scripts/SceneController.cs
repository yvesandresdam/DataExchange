using System.Collections;
using System.Collections.Generic;
using TMPro;
using UnityEngine;
using UnityEngine.SceneManagement;

public class SceneController : MonoBehaviour
{
    // Estas son las variables que pertenecen a cada nivel
    private int itemsRestantes;

    // Estos son los objetos del UI
    public TMP_Text puntuationText;
    public TMP_Text livesText;
    public TMP_Text nivelText;

    public TMP_Text itemsRestantesText;

    void Start()
    {   
        // Actualiza la variable que cuenta los items restantes de cada nivel
        itemsRestantes = FindObjectsOfType<Item>().Length;
        Debug.Log(itemsRestantes);
    }


    void Update()
    {
        // Actualiza los elementos del UI
        puntuationText.text = "Puntuacion: " + GameManager.Instance.puntuation;
        livesText.text = "Vidas: " + GameManager.Instance.lives;
        nivelText.text = "Nivel: " + GameManager.Instance.nivel;
        itemsRestantesText.text = "Restantes: " + itemsRestantes;
    }

    public void AnotarItemRecogido(int puntuation)
    {
        // Aumenta la puntuacion del personaje
        GameManager.Instance.puntuation += puntuation;
        itemsRestantes--;
        Debug.Log(itemsRestantes);

        if (itemsRestantes <= 0)
            AvanzarNivel();
    }
    private void AvanzarNivel()
    {
        // Cambia de nivel
        GameManager.Instance.nivel = 2;
        SceneManager.LoadScene("Scene2");
    }
    public void PerderVida()
    {
        // Funcion que hace perder una vida al jugador
        // Tambien recoloca al personaje
        Player jugador;
        GameManager.Instance.lives--;

        jugador = FindObjectOfType<Player>();
        jugador.Recolocar();
        if (GameManager.Instance.lives <= 0)
        {
            Application.Quit();
        }
    }
}
