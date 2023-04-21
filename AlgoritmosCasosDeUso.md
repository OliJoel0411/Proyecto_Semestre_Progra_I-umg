# Algoritmos para cada Caso de Uso
Link para diagramas de caso de Uso:
https://app.diagrams.net/#G1FaBDbWJNt8939l50z6-e6vKQFMfNgr5g


- Casos de uso:
    - *Registrar Eventos.*
    - *Comprar Boletos.*
    - *Generar Estadísticas mediante reportes HTML.*
    - *Registrar cuenta de usuario.*
    - *Administrar eventos.*
    - *Cambiar contraseña.*
- Actores:
    - *Cliente.*
    - *Administrador.*

### Algoritmo *Registrar Eventos.*
1. Solicita al administrador llenar un formulario de la manera siguiente:
 1.1 Nombre del Evento
 1.2 Fecha del Evento
 1.3 Hora de inicio del Evento
 1.4 Hora de fin del evento
 1.5 Sinopsis del evento
 1.6 Precio de entradas por sectores
    1.6.1 Establecer precio para VIP+M&G
    1.6.2 Establecer precio para VIP
    1.6.3 Establecer precio para PLATEA A
    1.6.4 Establecer precio para PLATEA B
 1.7 Fotografía de publicidad
 1.8 Nombre del responsable del Evento

### Algoritmo *Comprar Boletos.*
1. Escoger el sector donde desea comprar los asientos
2. Visualizar gráficamente la ubicación de los asientos
3. Selecciona la cantidad de boletos que desea haciendo click sobre ellos
4. Ingresar los datos de comprador
    4.1 Si el Cliente tiene un usuario registrado, rellenar automaticamente
5. Recibir pago (unicamente por tarjeta de crédito) 
6. Enviar por correo electrónico el comprobante

### Algoritmo *Generar Estadísticas mediante reportes HTML.*
- Para generar el comprobante de compra hacer uso de los datos registrados del cliente.
- Para gener listado de eventos hacer uso de la base de datos para consultar todos los eventos registrados
- Para generar el lisatado de boletos por evento hacer uso de la base de datos para consultar todos los boletos asociacidos a un evento.
- Para generar el listado de usuarios hacer uso de la base de datos para consultar todos los usuarios registrados (clientes)
- Para buscar un boleto en especifico cada boleto debe estar registrado por un correlativo para poder consultar uno en especifico haciendo uso de las bases de datos. 

### Algoritmo *Registrar cuenta de usuario.*

1.	Solicitar al Cliente que proporcione su nombre completo.
2.	Solicitar al Cliente que proporcione su dirección de correo electrónico.
3.	Verificar si el correo electrónico ya está registrado en el sistema.
4.	Si el correo electrónico no está registrado, solicitar al Cliente que proporcione una contraseña.
5.	Pedir al Cliente que confirme la contraseña.
6.	Verificar si las contraseñas coinciden.
7.	Si las contraseñas no coinciden, pedir al Cliente que las proporcione nuevamente.
8.	Si las contraseñas coinciden, crear una cuenta de Cliente con la información proporcionada por el Cliente.
9.	Almacenar la información de la cuenta de Cliente en una base de datos.
10.	Notificar al Cliente que la cuenta ha sido creada exitosamente

### Algoritmo *Administrar eventos.*

1. Mostrar el listado de eventos disponibles 
2. Elegir la visibilidad del evento (publico, privado)
    2.1 Si es publico
        2.1.1 Establecer fecha y hora para ser visible.
3. Carga masiva de venta de boletos

### Algoritmo *Cambiar contraseña.*
1.	Solicitar al usuario que ingrese su dirección de correo electrónico y la contraseña actual.
2.	Verificar si la dirección de correo electrónico y la contraseña coinciden con los registros en el sistema.
3.	Si la dirección de correo electrónico y la contraseña son correctas, solicitar al usuario que ingrese la nueva contraseña.
4.	Pedir al usuario que confirme la nueva contraseña.
5.	Verificar si las contraseñas coinciden.
6.	Si las contraseñas no coinciden, pedir al usuario que las proporcione nuevamente.
7.	Si las contraseñas coinciden, actualizar la información de la cuenta del usuario con la nueva contraseña.
8.	Almacenar la información actualizada de la cuenta de usuario en la base de datos.
9.	Notificar al usuario que la contraseña ha sido actualizada exitosamente.

