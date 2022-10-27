
function duplicaMatriz(matriz1) {
   
    for (i=0; i<matriz1.length; i++){
        var elemento=matriz1[i];
        matriz1[i]=elemento*2;
    }
        console.log(matriz1);

}

duplicaMatriz([1,6,2]);


function nuevoPrecio(matriz1) {
   
    for (i=0; i<matriz1.length; i++){
        var elemento=matriz1[i];
        matriz1[i]=elemento*0.8;
    }
        console.log(matriz1);

}

nuevoPrecio([1000,3000,500]);
