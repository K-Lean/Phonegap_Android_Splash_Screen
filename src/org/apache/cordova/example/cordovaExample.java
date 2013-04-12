/*
       Licensed to the Apache Software Foundation (ASF) under one
       or more contributor license agreements.  See the NOTICE file
       distributed with this work for additional information
       regarding copyright ownership.  The ASF licenses this file
       to you under the Apache License, Version 2.0 (the
       "License"); you may not use this file except in compliance
       with the License.  You may obtain a copy of the License at

         http://www.apache.org/licenses/LICENSE-2.0

       Unless required by applicable law or agreed to in writing,
       software distributed under the License is distributed on an
       "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
       KIND, either express or implied.  See the License for the
       specific language governing permissions and limitations
       under the License.
 */

package org.apache.cordova.example;

import android.os.Bundle;
import org.apache.cordova.*;

/**
 * @author Leandro @ Nafissi .COM.AR | A.K.A K-Lean
 */
public class cordovaExample extends DroidGap
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        
        // setamos el evento que permite mostrar un splash 'splashscreen' 
        // el atrubuto taza_medium de la clase R tiene el mismo nombre de
        // la imagen que cargaremos para que actue como splashscreen
        //
        //
        super.setIntegerProperty("splashscreen", R.drawable.taza_medium);
        
        
        // Carga el splashscreen y lo muestra 10 segundos antes de mostrar
        // la página principal, index.html. Luego el splash lo ocultamos
        // en el index usando javascript. Ver-> index.html 
        // function onDeviceReady()
        //
        //
        //super.loadUrl(Config.getStartUrl());
        
        // alternativa para cargar paginas
        super.loadUrl("file:///android_asset/www/index.html", 20000);
    }
}

