function measure(pwd) {
    $.ajax({
        type: 'POST',
        url: '/password',
        data: JSON.stringify({password: pwd}),
        success: function (data) {
            $('#score').text(data.score);
            $('#complexity').text(data.complexity);
        },
        contentType: "application/json",
        dataType: 'json'
    });
}