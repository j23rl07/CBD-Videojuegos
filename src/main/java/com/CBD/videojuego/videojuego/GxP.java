/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CBD.videojuego.videojuego;

import java.util.Objects;
import java.util.Set;

/**
 *
 * @author jaime
 */

public class GxP {
    
    private String plataforma;
    private Set<String> generos;

    public GxP(String plataforma, Set<String> generos) {
        this.plataforma = plataforma;
        this.generos = generos;
    }

    public GxP() {
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public Set<String> getGeneros() {
        return generos;
    }

    public void setGeneros(Set<String> generos) {
        this.generos = generos;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.plataforma);
        hash = 41 * hash + Objects.hashCode(this.generos);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final GxP other = (GxP) obj;
        if (!Objects.equals(this.plataforma, other.plataforma)) {
            return false;
        }
        return Objects.equals(this.generos, other.generos);
    }

    @Override
    public String toString() {
        return "GxP{" + "plataforma=" + plataforma + ", generos=" + generos + '}';
    }
    
    
    
}
