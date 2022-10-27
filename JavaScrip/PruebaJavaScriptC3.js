/*Ejercicio 1. Don José todos los martes y jueves realiza un 20% de descuento en el total de las
compras, crea una función la cual debe recibir un parámetro del día y el arreglo de
valores de los productos a comprar, esta debe retornar el total final de la compra según
corresponda o no descuento.*/

function preciosMarJue(dia){
    //se ingresa el día de la semana y la función actualizará los precios
    var precios=[1000,2000,500,1500,800];
    var precioOferta = [];
    if (dia == "martes" || dia == "jueves"){
        //se actualizan los precios si es martes o jueves 
        precios.forEach(x => precioOferta.push(x*0.8));
        
        console.log("estos son los precios del día " +precioOferta);
        console.log("------------");
    
            
        }else{
           
            console.log(precios);
            console.log(" ---------------------- ");
        }
}
preciosMarJue("martes");

 function nuevoPrecio(matriz1) {
   
        for (i=0; i<matriz1.length; i++){
            var elemento=matriz1[i];
            matriz1[i]=elemento*0.8;
            }
                console.log("estos son los precios del día" + matriz1);
                console.log("------------------");
        }
        

    


/*Don José hace un 5% de descuento a los clientes que compran más de 3 productos y al
menos uno de ellos tiene un valor mayor a 10.000, realiza una función que calcule el
total verificando si corresponde o no el descuento*/

function oferta2(array){

    for (i=0; array.length>i; i++){

        var valor=array[i];
        if (array.length>2 && valor>10000){
            console.log("Este cliente merece un descuento del 5%");
            console.log("------------------");


        }
     }
    
}

oferta2([2000,5000,1500,500]);

/*Se desea tener una función verificadora encargada de revisar si dentro de el arreglo de
valores de los productos a comprar no existan valores negativos ingresados por error,
en caso de no existir debe retornar un mensaje de éxito, en caso contrario debe retornar
un mensaje de error junto con el número negativo y el índice en el que se encontraba.*/

function detectaNegativo(precios){
    for (i=0; precios.length>i; i++){

        var elemento=precios[i];

        if (elemento<0){
        console.log("El precio ubicado en la posición " + precios.indexOf(elemento) + " del array y tiene un valor de " + elemento);
    
        } else{
        console.log("Revisión exitosa");
        console.log("------------------");
        }

    }
}
detectaNegativo([100,200,-50,50,-500]);


/*Dado el siguiente arreglo [200,5500,900,7000,500,300] con los valores de cada
producto 
Crea una función que retorne el valor del producto más costoso.
Crea una función que retorne el valor del producto menos costoso */


//esta funcion comprueba el valor mas alto de un arreglo dado
function masCostoso(arreglo){
    var masAlto = arreglo[0];
    for (i=1; i<arreglo.length; i++){
        if (masAlto < arreglo[i]) {
            masAlto = arreglo[i];
        }
        
    } console.log("el valor mas alto es " + masAlto);
        console.log("------------------");
}
masCostoso([100,5500,900,7000,500,300]);

//esta funcion comprueba el valor mas bajo de un arreglo dado
function menosCostoso(arreglo){
    var masBajo = arreglo[0];
    for (i=1; i<arreglo.length; i++){
        if (masBajo > arreglo[i]) {
            masBajo = arreglo[i];
        }
        
    } console.log("el valor mas bajo es " + masBajo);
        console.log("------------------");
}
menosCostoso([100,5500,900,7000,500,300]);