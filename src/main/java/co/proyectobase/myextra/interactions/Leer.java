package co.proyectobase.myextra.interactions;

import co.proyectobase.myextra.model.Target;
import co.proyectobase.myextra.util.Evidencia;
import co.proyectobase.myextra.util.myextra.MyExtra_init;
import co.proyectobase.myextra.util.myextra.Screen;
import co.proyectobase.myextra.util.myextra._Session;
import co.proyectobase.myextra.util.myextra._System;

public class Leer{
	
	public static _System sSystem = null;
	public static Screen screen = null;
	public static _Session Sess0 = null;
	public static int g_HostSettleTime = 3000;
	
	public static String elTextoEn(Target target){
		String textoPantalla="";
		sSystem = MyExtra_init.crearSistema();
		Sess0 = MyExtra_init.crearSesion(sSystem);
		screen = MyExtra_init.crearPantalla(Sess0);
		try {			
			Thread.sleep(2000);
			textoPantalla = screen.getString(target.getRow(), target.getCol(), target.getLenght(), screen);
			Evidencia.captureScreen();
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		return textoPantalla;
	}
	

	
	
}
