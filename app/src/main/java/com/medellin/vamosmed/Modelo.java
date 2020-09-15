package com.medellin.vamosmed;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.Intent;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.Serializable;

public class Modelo extends Application implements Serializable {

    public static final int LOCATION_SERVICE_ID = 175;
    public static final String ACTION_START_LOCATION_SERVICE = "startLocationsService";
    public static final String ACTION_STOP_LOCATION_SERVICE = "stopLocationsService";

    private String usuario;
    private String nombre;
    private String fotoPerfil;
    private boolean estadoViaje = false;
    private String idUsuario;
    private String idSedeDestino;
    private String x;//Destino
    private String y;
    private String idMedio;
    private String tipoViaje = "0";
    private String idViajeTem;
    private JSONObject jsonObjectViaje;
    private JSONArray jsonArrayViaje;
    private String traking;
    double longi;//Origen
    double lati;//
    double mts = 0.0;
    private JSONObject jsonObjectViajeProgreso;
    private JSONArray jsonArrayViajeProgreso;

    public JSONObject getJsonObjectViajeProgreso() {
        return jsonObjectViajeProgreso;
    }

    public void setJsonObjectViajeProgreso(JSONObject jsonObjectViajeProgreso) {
        this.jsonObjectViajeProgreso = jsonObjectViajeProgreso;
    }

    public JSONArray getJsonArrayViajeProgreso() {
        return jsonArrayViajeProgreso;
    }

    public void setJsonArrayViajeProgreso(JSONArray jsonArrayViajeProgreso) {
        this.jsonArrayViajeProgreso = jsonArrayViajeProgreso;
    }

    public double getLongi() {
        return longi;
    }

    public void setLongi(double longi) {
        this.longi = longi;
    }

    public double getLati() {
        return lati;
    }

    public void setLati(double lati) {
        this.lati = lati;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getIdSedeDestino() {
        return idSedeDestino;
    }

    public void setIdSedeDestino(String idSedeDestino) {
        this.idSedeDestino = idSedeDestino;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public String getIdMedio() {
        return idMedio;
    }

    public void setIdMedio(String idMedio) {
        this.idMedio = idMedio;
    }

    public String getTipoViaje() {
        return tipoViaje;
    }

    public void setTipoViaje(String tipoViaje) {
        this.tipoViaje = tipoViaje;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    public boolean isEstadoViaje() {
        return estadoViaje;
    }

    public void setEstadoViaje(boolean estadoViaje) {
        this.estadoViaje = estadoViaje;
    }

    public JSONObject getJsonObjectViaje() {
        return jsonObjectViaje;
    }

    public void setJsonObjectViaje(JSONObject jsonObjectViaje) {
        this.jsonObjectViaje = jsonObjectViaje;
    }

    public String getIdViajeTem() {
        return idViajeTem;
    }

    public void setIdViajeTem(String idViajeTem) {
        this.idViajeTem = idViajeTem;
    }

    public String getTraking() {
        return traking;
    }

    public void setTraking(String traking) {
        this.traking = traking;
    }

    public double getMts() {
        return mts;
    }

    public void setMts(double mts) {
        this.mts = mts;
    }

    public JSONArray getJsonArrayViaje() {
        return jsonArrayViaje;
    }

    public void setJsonArrayViaje(JSONArray jsonArrayViaje) {
        this.jsonArrayViaje = jsonArrayViaje;
    }

}
