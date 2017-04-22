function changeTab(status) {
	var indianarecordli1 = document.getElementById("indianarecordli1");
	var indianarecordli2 = document.getElementById("indianarecordli2");
	var indianarecordli3 = document.getElementById("indianarecordli3");
	var indianaallproduct = document.getElementById("indianaallproduct");
	var indianarunningproduct = document.getElementById("indianarunningproduct");
	var indianaannounceproduct = document.getElementById("indianaannounceproduct");
	if (status == '1') {
		indianarecordli1.style.color = "red";
		indianarecordli2.style.color = "#666";
		indianarecordli3.style.color = "#666";
		indianarecordli1.style.borderBottom = "2px solid red";
		indianarecordli2.style.border = "none";
		indianarecordli3.style.border = "none";
		indianaallproduct.style.display = "block";
		indianarunningproduct.style.display = "none";
		indianaannounceproduct.style.display = "none";
	} else if (status == '2') {
		indianarecordli2.style.color = "red";
		indianarecordli1.style.color = "#666";
		indianarecordli3.style.color = "#666";
		indianarecordli1.style.border = "none";
		indianarecordli2.style.borderBottom = "2px solid red";
		indianarecordli3.style.border = "none";
		indianaallproduct.style.display = "none";
		indianarunningproduct.style.display = "block";
		indianaannounceproduct.style.display = "none";
	} else {
		indianarecordli3.style.color = "red";
		indianarecordli2.style.color = "#666";
		indianarecordli1.style.color = "#666";
		indianarecordli1.style.border = "none";
		indianarecordli2.style.border = "none";
		indianarecordli3.style.borderBottom = "2px solid red";
		indianaallproduct.style.display = "none";
		indianarunningproduct.style.display = "none";
		indianaannounceproduct.style.display = "block";
	}
}


