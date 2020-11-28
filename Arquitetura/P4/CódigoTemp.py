# -*- coding: utf-8 -*-
"""
Created on Mon Nov 23 11:59:35 2020

@author: gdlau
"""

import folium
import os
import json
import pandas as pd
from folium.plugins import HeatMap
br_estados = 'br_states.json'
geo_json_data = json.load(open(br_estados))
#Exemplo de algumas latitudes e longitudes de SP 

df = pd.read_csv("sul.csv", delimiter=";")
mapa = folium.Map(
    width=600, height=400,
    location=[-15.77972, -47.92972], 
    zoom_start=3
)
#Colocando dados no mapa de calor
folium.GeoJson(geo_json_data).add_to(mapa)
HeatMap(df).add_to(mapa)

mapa.save('MapaDeTemp.html')