package com.example.primerproyectologin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    var textoCartel : String = "Hola Juani!!!"
    lateinit var txtCartel : TextView
    lateinit var txtContra : TextView
    lateinit var rootLayout :  ConstraintLayout
    lateinit var btnLogin : Button

    /* DATAOS DE LOGIN */
    var user : String = "admin"
    var password : String = "12345"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtCartel = findViewById(R.id.txtUsuario)
        //txtCartel.text = textoCartel
        txtContra = findViewById(R.id.txtContraseña)
        rootLayout = findViewById(R.id.rootLayout)
        btnLogin = findViewById(R.id.btnLogin)

        /*btnLogin.setOnClickListener {
            if(!esVacio(txtCartel.text) && !esVacio(txtContra.text)){
                if(txtCartel.text == user && txtContra.text == password){
                    Snackbar.make(rootLayout, "INGRESO EXITOSO", Snackbar.LENGTH_SHORT).show()
                } else {
                    Snackbar.make(rootLayout, "DATOS INCORRECTOS", Snackbar.LENGTH_SHORT).show()
                }
            }
        }*/
        btnLogin.setOnClickListener {
            if(!esVacio(txtCartel.text) && !esVacio(txtContra.text)){
                if(txtCartel.text == user && txtContra.text == password){
                    Snackbar.make(rootLayout, "INGRESO EXITOSO", Snackbar.LENGTH_SHORT).show()
                } else {
                    Snackbar.make(rootLayout, "DATOS INCORRECTOS", Snackbar.LENGTH_SHORT).show()
                }
            } else {
                Snackbar.make(rootLayout, "DEBE INGRESAR UN USUARIO Y CONTRASEÑA!!!", Snackbar.LENGTH_SHORT).show()
            }
        }

    }

    fun esVacio(ingreso: CharSequence): Boolean {
        if(ingreso.length == 0){
            return true;
        } else {
            return false;
        }
    }

}