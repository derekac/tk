window.onload = function() {
	changeNav();
}

function iFrameHeight() {
	var ifm = document.getElementById("container");
	var subWeb = document.frames ? document.frames["container"].document : ifm.contentDocument;
	if (ifm != null && subWeb != null) {
		ifm.height = subWeb.body.scrollHeight;
		ifm.width = subWeb.body.scrollWidth;
	}
}

function changeNav() {
	var lis = document.getElementsByClassName("navli");
	var imgs = document.getElementsByClassName("navimg");
	var texts = document.getElementsByClassName("divtext");

	for (var i = 0; i < lis.length; i++) {
		lis[i].id = i;
		lis[i].onclick = function() {
			changeOption(this.id);
		}
	}

	function changeOption(curIndex) {
		if (curIndex == 0) {
			imgs[0].src = "img/iconfont-duobao (1).png";
			texts[0].style.color = "#ea8010";
			imgs[1].src = "img/iconfont-zuixinjiexiaomeixuanzhong.png";
			texts[1].style.color = "#a9b7b7";
			imgs[2].src = "img/iconfont-show.png";
			texts[2].style.color = "#a9b7b7";
			imgs[3].src = "img/iconfont-qingdan.png";
			texts[3].style.color = "#a9b7b7";
			imgs[4].src = "img/iconfont-wodeduobao.png";
			texts[4].style.color = "#a9b7b7";
		} else if (curIndex == 1) {
			imgs[0].src = "img/iconfont-duobao.png";
			texts[0].style.color = "#a9b7b7";
			imgs[1].src = "img/iconfont-zuixinjiexiao.png";
			texts[1].style.color = "#ea8010";
			imgs[2].src = "img/iconfont-show.png";
			texts[2].style.color = "#a9b7b7";
			imgs[3].src = "img/iconfont-qingdan.png";
			texts[3].style.color = "#a9b7b7";
			imgs[4].src = "img/iconfont-wodeduobao.png";
			texts[4].style.color = "#a9b7b7";
		} else if (curIndex == 2) {
			imgs[0].src = "img/iconfont-duobao.png";
			texts[0].style.color = "#a9b7b7";
			imgs[1].src = "img/iconfont-zuixinjiexiaomeixuanzhong.png";
			texts[1].style.color = "#a9b7b7";
			imgs[2].src = "img/iconfont-show (1).png";
			texts[2].style.color = "#ea8010";
			imgs[3].src = "img/iconfont-qingdan.png";
			texts[3].style.color = "#a9b7b7";
			imgs[4].src = "img/iconfont-wodeduobao.png";
			texts[4].style.color = "#a9b7b7";
		} else if (curIndex == 3) {
			imgs[0].src = "img/iconfont-duobao.png";
			texts[0].style.color = "#a9b7b7";
			imgs[1].src = "img/iconfont-zuixinjiexiaomeixuanzhong.png";
			texts[1].style.color = "#a9b7b7";
			imgs[2].src = "img/iconfont-show.png";
			texts[2].style.color = "#a9b7b7";
			imgs[3].src = "img/iconfont-qingdan (1).png";
			texts[3].style.color = "#ea8010";
			imgs[4].src = "img/iconfont-wodeduobao.png";
			texts[4].style.color = "#a9b7b7";
		} else if (curIndex == 4) {
			imgs[0].src = "img/iconfont-duobao.png";
			texts[0].style.color = "#a9b7b7";
			imgs[1].src = "img/iconfont-zuixinjiexiaomeixuanzhong.png";
			texts[1].style.color = "#a9b7b7";
			imgs[2].src = "img/iconfont-show.png";
			texts[2].style.color = "#a9b7b7";
			imgs[3].src = "img/iconfont-qingdan.png";
			texts[3].style.color = "#a9b7b7";
			imgs[4].src = "img/iconfont-wodeduobao (1).png";
			texts[4].style.color = "#ea8010";
		}
	}
}