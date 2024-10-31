using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class GameManager : MonoBehaviour
{
    // Referencia static a la instancia del GameManager
    public static GameManager Instance;
    // Valores que queremos mantener a lo largo de las distintas escenas
    public int puntos = 0;
    public int vidas = 3;
    public int nivelActual = 1;
    public int nivelMasAlto = 2;
    void Awake()
    {
        if (Instance == null) // Si no hay instancia del GameManager
        {
            Instance = this;
            // Mantiene el GameObject, a través de distintas escenas
            DontDestroyOnLoad(gameObject);
        }
        else
        {
            // ya hay una instancia del GameManager. Destruimos esta.
            Destroy(gameObject);
        }
    }
}
