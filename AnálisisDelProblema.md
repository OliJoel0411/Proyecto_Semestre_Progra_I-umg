# ANÁLISIS DEL PROBLEMA

## Gestor de Eventos y Venta de Boletos

    * Problemática: Un sistema para la gestión de eventos y venta de boletos para dichos eventos.
            El Sistema debe permitir:
        1. Registro de Eventos
        2. Venta de Boletos
        3. Administaración de Eventos (Sistema en General)
        4. Generar Reportes
        5. Manual de Usuarios (Externo a la Aplicación)
        6. Manual Técnico (Externo a la Aplicación)
    
    




### 1. REGISTRO DE EVENTOS:

    * La empresa tiene venue(sedes), donde se realizan los eventos. de los eventos se desea registrar los siguientes datos: 
        - Fecha del evento(puede tener mas de una fecha).
        - Hora de inicio.
        - Hora fin.
            - puede haber varios horarios para un mismo evento. 
        - Sinopsis del evento.
        - Nombre del evento.
        - Precio de entrada por sectores.
        - Fotografía del evento.
        - Nombre del Responsable del evento (persona o empresa)

    * CARACTERÍSTICAS A TOMAR EN CUENTA:
        - Se pueden revisar que eventos están disponible, pidiendo al usuario que ingrese un rango de fecha y hora.
        - Los eventos pueden estar visibles o no.
        - Se puede establecer una fecha para que los eventes dejen de estar visibles publicamente. 
        - El venue(Sedes) están organizadas en 4 secciones:
            * VIP+M&G
            - VIP
            - PLATEA A
            - PLATEA B
                - Cada una de estas tiene un precio diferente.   
                - Cada uno está identificado por su posición. 
### 2. Venta de Boletos
    - Solo se pueden comprar 10 boletos o menos por operación.
    - Según la interfaz gráfica, debe permitir que el usuario seleccione los asientos que desee dando click sobre el botón. 
    - Tiene 5 min para seleccionar cada boleto, de cumplirse el tiempo, debe volver al paso anterior.
    - Para realizar la compra, debe solicitarse la información del comprador. El cliente tiene 10 min para concluir con este proceso.
    - Cada boleto debe tener un identificador único. 

        DATOS DEL COMPRADOR:
        * Nombre
        * Apellido
        * E-mail
        * Confirmación de email
        * Teléfono

    - El unico método de pago será por medio de tarjeta de crédito.

        DATOS PARA LA COMPRA POR TARJETA
        * Nombre del tarjetahabiente
        * Número de tarjeta de crédito
        * Fecha de vencimiento de la tarjeta de crédito
        * Código de verificción de la tarjeta
        * Direccion del comprador
        * Código postal

    - Adicionalmente debe mostrar un resumen de la compra realizada. Esto incluye el cobro extra por el servicio de compra en línea, el cual debe ser configurado al registrarse el evento. Dispone de 5 min para completar este proceso. Si este tiempo lleva a su final entonces se regresará al usuario a la selección de la cantidad de boletos.

CONSIDERACIONES NECESARIAS SOLICITADAS POR EMSA S.A

    - En cada uno de los pasos anterior se debe permitir al usuario regresar al paso anterior y mostrar un mensaje que indique al usuario que su tiempo se ha vencido y que será regresado al primer paso y que los asientos seleccionados serán liberados.
    - al seleccionar un asiento, por cada asiento que se seleccione se debe mostrar un mensaje que confirme la selección. Este mensaje de conformación debe mostrar el número de fila y número de asiento seleccionado.
    - se debe mostrar un contador que indique cuántos boletos han sido seleccionados del total indicado en el paso 1 que se desean comprar 
    Ejemplo: 1/10 (un boleto seleccionado de diez disponibles).
    - Al momento de ingresar los datos del comprador debe mostrar la opcion de iniciar sesión para que sean llenados automaticamente. 

### 3. Administaración de Eventos

    - Se debe tener en consideración que existirán dos tipos de usuario, los administradores que son quienes realizarán el registro de eventos en el sistema y los clientes. 
    - Generar reportes HTML:
        - Datos que se morstrarán al comprar boletos:
            - Número de boletos.
            - Nombre del evento.
            - Nombre del cliente.
            - La sección en donde se compraron los boletos.
            - Identificador de los asientos. 
            - Fecha y hora del evento.
            - Dirección de la sede. 
            - Precio total a cancelar. 
        - Listado de Eventos:
            - Este reporte debe mostrar todos los eventos que se tienen registrados en la plataforma mostrando su nombre, fecha, hora de inicio, hora de fin. Se debe permitir filtrar los datos que muestra el reporte por medio del estado del evento (vencido, activo, publicado, sin publicar) y por fecha del evento.
        - Listado de boletos: 
            - Este reporte debe mostrar la cantidad de boletos vendidos y la cantidad de boletos disponibles en total, así como la cantidad de boletos vendidos por cada sección y la cantidad de boletos disponibles por sección. Se debe permitir filtrar los datos por evento.
        - Detalle de boletos por evento:
            - Este reporte debe mostrar un listado de todos los asientos indicando cuales se encuentran disponibles aún y cuales ya se encuentran ocupados. Para aquellos que se encuentren ocupados se debe mostrar los datos del cliente que realizó la compra. Se debe permitir filtrar los datos por evento.
        - Listado de Usuarios:
            - Debe mostrar los datos de todos los usuarios del sistema. Se debe permitir filtrar por rol (administrador o cliente) y por estado (activo o inactivo).
        - Consultar boleto:
            - Este reporte debe permitir consultar los datos de un boleto en específico. Se debe realizar la búsqueda por medio de un número de boleto.


#### CARACTERÍSTICAS ADICIONALES:
    - Existen evento que tienen múltiples fechas y también eventos en los cuales se venden múltiples boletos por parte del organizador del evento, debido a esto se debe contar con la opción de cargar múltiples eventos y vender grupos grandes de boletos cargando los datos por medio de archivos de texto.
    - Estos archivos de texto contienen todos los datos necesarios para realizar la carga de eventos o la carga de archivos, en donde cada línea del archivo representa un evento o un boleto, según sea la opción que se este utilizando. .