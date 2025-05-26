package com.daimcinco.parcial2.model

data class Products(
    val id: Int,
    val name: String,
    val category: String,
    val description: String,
    val price: Float,
    val product_IMG: String,
    var addedToCart: Boolean
)

val productList = listOf(
    Products(
        id = 1,
        name = "Smartphone X200",
        category = "Electrónica",
        description = "Smartphone de última generación con pantalla OLED y cámara de 108 MP.",
        price = 799.99f,
        product_IMG = "https://www.adobe.com/la/creativecloud/photography/discover/media_1b97e856d56c65e2461329a892f7d6a7eb5176e22.jpeg?width=1200&format=pjpg&optimize=medium",
        addedToCart = false
    ),
    Products(
        id = 2,
        name = "Auriculares Pro",
        category = "Audio",
        description = "Auriculares inalámbricos con cancelación de ruido activa.",
        price = 199.99f,
        product_IMG = "https://static.bidcom.com.ar/publicacionesML/productos/ABLUE108/1000x1000-ABLUE108.jpg",
        addedToCart = false
    ),
    Products(
        id = 3,
        name = "Laptop Ultraliviana",
        category = "Computación",
        description = "Laptop ligera con procesador i7 y 16 GB de RAM.",
        price = 1199.00f,
        product_IMG = "https://cdn.thewirecutter.com/wp-content/media/2024/11/cheapgaminglaptops-2048px-7981.jpg",
        addedToCart = false
    ),
    Products(
        id = 4,
        name = "Reloj Inteligente FitTrack",
        category = "Wearables",
        description = "Reloj inteligente con seguimiento de actividad y ritmo cardíaco.",
        price = 149.50f,
        product_IMG = "https://m.media-amazon.com/images/I/71R2LfMrlFL._AC_SL1500_.jpg",
        addedToCart = false
    ),
    Products(
        id = 5,
        name = "Cámara Reflex ZX500",
        category = "Fotografía",
        description = "Cámara profesional con lente intercambiable y sensor de alta resolución.",
        price = 899.00f,
        product_IMG = "https://quecamarareflex.com/wp-content/uploads/2015/01/nikon_d5300_reflex_camara.jpg",
        addedToCart = false
    ),
    Products(
        id = 6,
        name = "Silla Gamer Xtreme",
        category = "Muebles",
        description = "Silla ergonómica con diseño gaming y soporte lumbar ajustable.",
        price = 299.99f,
        product_IMG = "https://mail.zonadigitalsv.com/product/4044951032334/image",
        addedToCart = false
    ),
    Products(
        id = 7,
        name = "Monitor 4K 27”",
        category = "Informática",
        description = "Monitor Ultra HD con panel IPS y HDR.",
        price = 379.49f,
        product_IMG = "https://xiaomistore.com.sv/wp-content/uploads/Xiaomi_Monitor_A22i1.webp",
        addedToCart = false
    ),
    Products(
        id = 8,
        name = "Zapatillas Urbanas",
        category = "Calzado",
        description = "Zapatillas de moda para uso diario, muy cómodas y duraderas.",
        price = 89.99f,
        product_IMG = "https://zshopp.com/wp-content/uploads/2024/08/Tenis-Zapatillas-Nike-Bailleli-Fashion-4.webp",
        addedToCart = false
    ),
    Products(
        id = 9,
        name = "Mochila Antirrobo",
        category = "Accesorios",
        description = "Mochila con cierre oculto y puerto USB para carga de dispositivos.",
        price = 45.90f,
        product_IMG = "https://m.media-amazon.com/images/I/61H0utf3ucL._AC_SL1000_.jpg",
        addedToCart = false
    ),
    Products(
        id = 10,
        name = "Cafetera Inteligente",
        category = "Electrodomésticos",
        description = "Cafetera programable con control desde app móvil.",
        price = 129.99f,
        product_IMG = "https://walmartsv.vtexassets.com/arquivos/ids/399303/Cafetera-Durabrand-12-Tazas-1-7801.jpg?v=638420760224800000",
        addedToCart = false
    )
)
