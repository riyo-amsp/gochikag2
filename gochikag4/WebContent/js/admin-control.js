$(function() {
	$('#category').on('change', function(){
//		.html("")は、まずpriductのなかを空っぽにしたよ 
		$('#product').html('');

		  var option;
		  option = '<option value="製品1">製品1</option>';
		  $('#product').append(option);
		  option = '<option value="製品2">製品2</option>';
		  $('#product').append(option);
		  option = '<option value="製品3">製品3</option>';
		  $('#product').append(option);

		});
	var products = {
			  a:[
			    '製品1',
			    '製品2',
			  ],
			  b:[
			    '製品3',
			    '製品4',
			  ],
			  c:[
			    '製品5',
			    '製品6',
			    '製品7',
			  ],
			};

			$('#category').on('change', function(){
			  var p = $(this).val();
			  var item = products[p]; 
			  $('#product').html('');
			  var option;
			  for(var i = 0; i < item.length; i++){
			    option = '<option value="' + item[i] + '">' + item[i] + '</option>';
			    $('#product').append(option);
			  }
			});
});