function DivEntreNueveYCuatro(x){
    if (x%4==0){
        console.log("verdadero");
    }else if (x%9==0){
        console.log("verdadero");
     }else{
        console.log("falso")
     }
    }
DivEntreNueveYCuatro(7);

function menorPrecio(x,y,z){
    if (x<y){
        var bar1=x;
        var bar2=y;
    
    }else{
        bar1=y;
        bar2=x;
    } if (bar2<z){
        bar1=bar1;
        bar2=bar2;
    
    } else {
        bar2=z
    }
    
    
console.log(bar1,bar2);
}
menorPrecio(7,2,5);

// si  Marco atiende a 1 persona mientras maria atiende a 2
// y Tomas solo puede atender  a 3, en total hay 15 cuantos atienden cada uno?

let maria = 0;
let marco = 0;
let total ;
// en esta asignacion se hace por que marco solo puede antender 
// a 3 personas por lo que se entiende que es un valor constante
const tomas = 3; 

for (let i = 0; i <= 12; i++) {
    if (i == 3 || i == 6 || i == 9 || i == 12) {
        maria = maria + 2;
    }
           marco =  maria / 2 ;
    
    
}
 
total = maria + marco + tomas;
console.log('Clientes Atendidos= ' + total);
console.log('Clientes que fueron atendios por Marco= ' ,  marco);
console.log('Clientes que fueron atendios por Maria= ' ,  maria);
console.log('Clientes que fueron atendios porTomas=  ' ,  tomas);
