# Instalación de Odoo 18, VS Code y Pgadmin
### Lo primero que haremos es preparar nuestro entorno de trabajo, en mi caso lo haré en VS Code, creando una carpeta especifica para el trabajo con la siguiente distribución de archivos:

<img width="517" height="220" alt="image" src="https://github.com/user-attachments/assets/146b271b-cb4c-4bb8-a547-9980334485ab" />

├── addons              # Carpeta para tus módulos personalizados<br>
├── config              # Carpeta para archivos de configuración (ej: odoo.conf)<br>
└── docker-compose.yml  # Archivo principal de Docker Compose <br>

# Extensiones que isntalé en VS Code:
<img width="510" height="782" alt="image" src="https://github.com/user-attachments/assets/b87fb612-fc3e-4b32-894a-b63d1daa2f93" /> <br>


| Extensión | Utilidad para el Proyecto Odoo/Docker |
| :--- | :--- |
| **Container Tools** | Gestión y depuración de contenedores dentro de VS Code. |
| **Docker** | **Controla contenedores**, imágenes y redes de Docker Compose. |
| **Git Blame** | Muestra el autor y fecha de la última modificación de cada línea de código. |
| **HTML CSS Support** | **Autocompletado** inteligente para código HTML y CSS. |
| **Pylance** | **Servidor de lenguaje avanzado** para Python (IntelliSense y análisis rápido). |
| **Pylint** | **Analiza el código Python** buscando errores y aplicando estándares de estilo. |
| **Python** | Soporte fundamental para **desarrollo, depuración y ejecución** de código Python. |


# Instalación de Odoo 18 Community y PgAdmin con Docker Compose:
## contenido del archivo .yml:

<img width="503" height="361" alt="image" src="https://github.com/user-attachments/assets/082a3962-694f-4a43-96f4-dcb1db37d852" />

<img width="621" height="397" alt="image" src="https://github.com/user-attachments/assets/9cadbbb6-973b-44ee-bafb-1cf7e8c0a0ee" />

<img width="562" height="510" alt="image" src="https://github.com/user-attachments/assets/c254b262-f88f-4de5-b19e-a28f50bf792a" />


### confirmación de que todo funciona:

<img width="1535" height="478" alt="image" src="https://github.com/user-attachments/assets/98311006-b7b0-4920-9222-c0ff7413edf6" />

## Acceso a Odoo:
<img width="1918" height="958" alt="image" src="https://github.com/user-attachments/assets/9b40bee1-15fe-4867-93ca-f2b605c85a94" />
( MUY IMPORTANTE, que no me cabia en la captura, solo hay q marcar una pequeña casilla q pone Demo Data )
<img width="1918" height="932" alt="image" src="https://github.com/user-attachments/assets/8c9bcfe5-c280-4b4a-8171-5c3e44e82241" />


## Acceso a PgAdmin:
<img width="1912" height="880" alt="image" src="https://github.com/user-attachments/assets/bbd8d235-4251-49ad-baaf-357fe9ba8421" />

### Registramos un nuevo servidor:
Vamos a Server y le damos a generar nuevo servidor y le ponemos en este caso la siguiente conf: <br>

<img width="863" height="677" alt="image" src="https://github.com/user-attachments/assets/72a5cfe6-b71f-421f-86cd-a551e6af944f" />

<img width="861" height="682" alt="image" src="https://github.com/user-attachments/assets/6085589e-b745-4157-b4b7-0ed06713bdd6" />

<img width="1918" height="772" alt="image" src="https://github.com/user-attachments/assets/6318275b-6990-4194-86cb-deda5f82f3c2" />

# Exploración de Odoo con Datos de Demo:
### Instalamos los servicios basicos en la barra de busqueda:

<img width="453" height="521" alt="image" src="https://github.com/user-attachments/assets/2fc7d0ff-ef50-4ebb-88d3-a62c0d3aee57" />

### ejemplo de compra:

<img width="1918" height="1002" alt="image" src="https://github.com/user-attachments/assets/10fad573-30d6-45b2-b260-c2ec819086ad" />

### ejemplo de venta:

<img width="1917" height="652" alt="image" src="https://github.com/user-attachments/assets/4b7f6e69-d305-4852-ba4b-85b365c44c79" /> 

### ejemplo de contactos:


<img width="1913" height="1003" alt="image" src="https://github.com/user-attachments/assets/463ac8f2-1227-4732-889b-c5583c99287c" />














