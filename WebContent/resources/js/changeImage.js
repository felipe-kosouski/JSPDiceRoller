function changeImg(){
	var select = document.getElementById("dice-select");
	var getSelected = select.options[select.selectedIndex].index;

	switch (getSelected) {
	case 1:
		document.getElementById("dice").src = "resources/img/d4.png";
		break;
	case 2:
		document.getElementById("dice").src = "resources/img/d6.png";
		break;
	case 3:
		document.getElementById("dice").src = "resources/img/d8.png";
		break;
	case 4:
		document.getElementById("dice").src = "resources/img/d10.png";
		break;
	case 5:
		document.getElementById("dice").src = "resources/img/d12.png";
		break;
	case 6:
		document.getElementById("dice").src = "resources/img/d20.png";
		break;
	default:
		document.getElementById("dice").src = "resources/img/d20.png";
		break;
	}

}
