using System.Collections;
using System.Collections.Generic;
using TMPro;
using UnityEngine;

public class GameManager : MonoBehaviour
{
    // Referencia static a la instancia del GameManager
    public static GameManager Instance;

    // Valores que queremos mantener a lo largo de las distintas escenas
    public int puntuation = 0;
    public int lives = 3;
    public int nivel = 1;

    void Awake()
    {
        if (Instance == null) 
        {
            Instance = this;
            // Mantiene el GameObject, a través de distintas escenas
            DontDestroyOnLoad(gameObject);
        }
        else
        {
            // Significa que ya existe un GameManager, por tanto, destruimos la que esta por crearse.
            Destroy(gameObject);
        }
    }
}
