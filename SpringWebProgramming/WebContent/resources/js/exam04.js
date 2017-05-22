function totalSum(from,to){
	if(to ==undefined){
		to=from;
		from=1;
	}  //to 값이 없을때 
				
	var sum=0;
	for(var i=from; i<=to; i++){
		sum+=i;
	}
	return sum;
}
			
function handleBtnOk(){
	console.log("OK 버튼을 클릭함");
}