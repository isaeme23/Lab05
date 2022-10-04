# Laboratorio 5
## CVDS 2022 - 2
### PARTE I. - JUGANDO A SER UN CLIENTE HTTP

1. Abra una terminal Linux o consola de comandos Windows.
![](resourcer/1.png)


2. Realice una conexión síncrona TCP/IP a través de Telnet al siguiente servidor:
   * Host: www.escuelaing.edu.co
   * Puerto: 80
![](resourcer/2.png)


3. Antes de que el servidor cierre la conexión por falta de comunicación:
    * Solicite al servidor el recurso ‘sssss/abc.html’,
      usando la versión 1.0 de HTTP.
   ![](resourcer/3.png)
    * ¿Qué código de error sale? 400 Bad Request
    * ¿Qué otros códigos de error existen?, ¿En qué caso se manejarán?
      
       **Códigos de Información:** 1xx. Alertan al cliente que espere por
       una respuesta final.
   
       **Códigos de éxito:** 2xx. Informa que la acción tomada por el
       cliente fue recibida, entendida y aceptada.
   
       **Códigos de redirección:** 3xx. En este tipo de casos se indica que
       cliente debe tomar acciones adicionales para completar la petición.
       
       **Códigos de error de cliente:** 4xx. El error parece ser causado
        por el cliente.

       **Códigos de error del servidor:** 5xx. El servidor falla en completar la petición.


4. Realice una nueva conexión con telnet, esta vez a:
   * Host: www.httpbin.org
   * Puerto: 80
   * Versión HTTP: 1.1

   Ahora, solicite (GET) el recurso /html. ¿Qué se obtiene como resultado?
   
   ![](resourcer/5.png)


5. Seleccione el contenido HTML de la respuesta y copielo al cortapapeles CTRL-SHIFT-C. Ejecute el comando wc (word count) para contar palabras con la
   opción -c para contar el número de caracteres:

   Guardamos el contenido del resultado en un archivo de texto y ejecutamos el comando
    ![](resourcer/4.png)


6. En la práctica no se utiliza telnet para hacer peticiones a sitios web sino el comando curl con ayuda de la línea de comandos:
   ![](resourcer/6.png)


   Utilice ahora el parámetro -v y con el parámetro -i:
    
   **Usando el parametro -v**

   Nos muestra de forma actualizada las consultas y pedidos que se hacen para obtener la informacion:
   ![](resourcer/7.png)
  
   Nos muestra mas informacion detallada de la fecha e informacion sobre el contenido requerido
   ![](resourcer/8.png)