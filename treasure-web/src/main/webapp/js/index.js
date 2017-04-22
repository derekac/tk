/**
 * Created by jason on 16/4/17.
 */
window.onload = function () {
    var productjindurate = document.getElementsByClassName("productjindurate");
    var productjindubottomgrey = document.getElementsByClassName("productjindubottomgrey");
    for (var i = 0; i < productjindurate.length; i++) {
        var rate = productjindurate[i].innerHTML;
        productjindubottomgrey[i].style.width = rate;
    }
}

/*清单*/
window.onload = function () {
    var qingdan = $('.qingdan');
    var qingdanulnum = $('.qingdanulnum');
    var qingdanulreduce = $('.qingdanulreduce');
    var qingdanuladd = $('.qingdanuladd');
    for (i = 0; i < qingdan.length; i++) {
        qingdan[i].id = i;
        qingdanulnum[i].id = 'qingdanulnum' + i;
        qingdanulreduce[i].id = 'qingdanulreduce' + i;
        qingdanuladd[i].id = 'qingdanuladd' + i;
    }
}

function clickDelete(index) {
    var totalprice = $('#totalprice');
    var qingdandelete = $('#' + index);
    var qingdanulnum = $('#qingdanulnum' + index).text();
    totalprice.text(totalprice.text() - qingdanulnum);
    qingdandelete.remove();
}

function clickAdd(index) {
    var totalprice = $('#totalprice');
    var qingdanulnum = $('#qingdanulnum' + index);
    qingdanulnum.text(parseInt(qingdanulnum.text()) + 1)
    totalprice.text(parseInt(totalprice.text()) + 1);
}

function clickReduce(index) {
    var totalprice = $('#totalprice');
    var qingdanulnum = $('#qingdanulnum' + index);
    qingdanulnum.text(parseInt(qingdanulnum.text()) - 1)
    totalprice.text(parseInt(totalprice.text()) - 1);
}

function showtab() {
    $('#lijicanyu').show();
    $('#backgroundgrey').show();
}

function closetab() {
    $('#lijicanyu').hide();
    $('#backgroundgrey').hide();
}

function reducejointimes() {
    var jointimes = $('#jointimes').val();
    if (jointimes > 1) {
        $('#jointimes').val(parseInt(jointimes) - 1);
    }
}

function addjointimes() {
    var jointimes = $('#jointimes').val();
    $('#jointimes').val(parseInt(jointimes) + 1);
}

function choosepaytype(type) {
    if (type == 0) {
        document.getElementById('alipay').src = '../img/choose.png';
        document.getElementById('wechat').src = '../img/unchoose.png';
        document.getElementById('paytype').value = 0;
    } else {
        document.getElementById('alipay').src = '../img/unchoose.png';
        document.getElementById('wechat').src = '../img/choose.png';
        document.getElementById('paytype').value = 1;
    }
}

function toconfirmpage() {
    var activityId = document.getElementById('activityId').value;
    var jointimes = document.getElementById('jointimes').value;
    var productname = document.getElementById('productname').innerHTML;
    window.location.href = '../Pay/confirmOrder?jointimes=' + jointimes + '&productname=' + productname + '&productnum=1' + '&activityId=' + activityId;
}

function submitorder() {
    var productnum = document.getElementById('productnum').value;
    var jointimes = document.getElementById('jointimes').value;
    var activityId = document.getElementById('activityId').value;
    window.location.href = '../Pay/payPage?productnum=' + productnum + '&jointimes=' + jointimes + '&activityId=' + activityId;
}