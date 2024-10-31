using System.Collections;
using System.Collections.Generic;
using TMPro;
using UnityEngine;
using UnityEngine.SceneManagement;

public class SceneController : MonoBehaviour
{
    private int puntuation;
    public TMP_Text puntuationText;

    private int itemsRestantes;

    void Start()
    {
        puntuation = 0;
        puntuationText.text = "0";

        itemsRestantes = FindObjectsOfType<Item>().Length;
    }


    void Update()
    {
        puntuationText.text = puntuation.ToString();
    }

    public void AddPoints(int value)
    {
        puntuation += value;
    }  

    public void AnotarItemRecogido()
    {
        GameManager.Instance.puntos += 100;
        Debug.Log("Puntos: " + GameManager.Instance.puntos);
        itemsRestantes--;
        Debug.Log("Items: " + itemsRestantes);
        if (itemsRestantes <= 0)
            AvanzarNivel();
    }
    private void AvanzarNivel()
    {
        GameManager.Instance.nivelActual = 2;
        SceneManager.LoadScene("Scene2");
    }
    public void PerderVida()
    {
        Player jugador;
        GameManager.Instance.vidas--;
        jugador = FindObjectOfType<Player>();
        jugador.Recolocar();
        Debug.Log("Quedan " + GameManager.Instance.vidas + " vidas.");
        if (GameManager.Instance.vidas <= 0)
        {
            Debug.Log("Partida terminada");
            Application.Quit();
        }
    }
}
