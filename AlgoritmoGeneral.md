# Algoritmo General

1. Abrir el ejecutable. 
2. Se muetra un ventana que da la bienvenida al usuario 
3. La ventana contiene botones para iniciar sesion, crear una cuenta, ver eventos disponibles y salir.
    3.1 Si el usuario da click sobre el botón iniciar sesión
        3.1.1 Se muestra una venta con las opciones para iniciar sesión como cliente o como Administrador
        3.1.2 Si el usuario elige iniciar sesión como cliente
            3.1.2.1 Se muestra una ventana donde solicita al usuario sus credenciales. 
            3.1.2.2 Si el usuario ingresa las credenciales correctas 
            3.1.2.3 Se muestra una ventana con los eventos diponibles  en donde el usuario puede comprar boletos para participar.
            3.1.2.4 El usario da click sobre el evento que le interesa
            3.1.2.5 Se muestra una ventana con el detalle del evento y el boton disponible para comprar boletos
            3.1.2.6 El usuario da click en el boton comprar boletos
            3.1.2.7 Se muestra una ventana con un gráfico de las areas disponibles para asientos. Se solicita al usuario la cantidad de boletos que desea comprar. 
            3.1.2.8 El usuario da click en el area donde desea comprar un boleto para su asiento (el grafico deberia mostrar el precio que tiene el asiente en dicha area)
            3.1.2.9 Se muestra una ventana con los asientos diponibles para esa área.
            3.1.2.10 El usuario da click sobre el asiento con la ubicación representada en el gráfico que desee (Tiene 5 min para seleccionar los asientos que desee) Se debe mostrar un mensaje de confirmacion cada vez que seleccione un asiento
            3.1.2.11 Este se suma a la cantidad disponible de boletos que tiene para comprar y este se muestra en la pantalla (segun cantidad de boletos seleccionado)
            3.1.2.12 Una vez seleccionado lo asientos, se solicita al comprador sus datos(facturacion) (nombre, apellido, e-mail, confirmacion de e-mail, telefono del comprador) Se envia un correo con los boletos seleccionados (10 min para esta accion) Tiene la opcion de Autocompletar**
            3.1.2.13 Se solicita al usuario realizar su pago unicamente con tarjeta de crédito. 
            3.1.2.14 Se muestra una ventana con un formulario para que el usuario ingrese los datos correspondientes a la tarjeta. 
            3.1.2.15 Se muestra el resumen de la compra, incluyendo el porcentaje que se cobra por servicios en línea. (tiene 5 min para completar esta tarea)
            3.1.2.16 Al finalizar la compra se genera un archivo HTML que será usado para generar los reportes (almacenado en la base de datos.)
        3.1.2 Si el usuario elige iniciar sesión como Administrador
            3.1.2.1 Se muestra una ventana con los botones, Registrar Eventos, ver Eventos disponibles, generar reportes
            3.1.2.2 Si el usario da click en registrar Evento
                3.1.2.2.1 Se muestra una ventana con el formulario solicitando los datos necesarios para registrar un evento
                3.1.2.2.2 Se muestra en esta misma ventana un boton para establecer la visibilidad de los eventos
            3.1.2.3 Si el usario da click en ver Eventos disponibles
                3.1.2.3.1 Se muestra una ventana con los eventos disponibles, y un boton para establecer la visibilidad de los eventos
            3.1.2.4 Si el usario da click en Generar reportes
                3.1.2.4.1 Se muestra una ventana con los botenes para los reportes tales como: Listado de Eventos, Listado de boletos, Detalles de boletos por evento, Listado de usuario, consultar boleto. 
    3.2 Si el usuario da click sobre el botón ver eventos disponibles. 
        3.2.1 Se repite la lógica de INICIAR SESIÓN 
    3.3 Si el usuario da click sobre el botón SALIR, se cierra el progama. 
    3.4 Si el usuario da click sobre el botón crear una cuenta
        3.4.1 Se muestra una ventana con el formulario correspondiente solicitando los datos necesarios para crear una cuenta






            








            