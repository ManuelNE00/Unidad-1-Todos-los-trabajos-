/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.youtubee;

/**
 *
 * @author mene_
 */
public class Youtubee {

    public static void main(String[] args) {
        Usuario usuario= new Usuario("Niño");
        Video video= new Video("aprendiendo java",2500,"https;//niño.com"); 
        usuario.subirVideo(video);
        usuario.mostrarInfoUsuario();
    }
}
