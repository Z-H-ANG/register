package com.example.register;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);


		EditText editText = (EditText) findViewById(R.id.passwd);

		editText.addTextChangedListener(textWatcher);
	}



	private TextWatcher textWatcher = new TextWatcher() {
		@Override
 public void beforeTextChanged(CharSequence s, int start, int count, int after) {


}


 @Override
 public void onTextChanged(CharSequence s, int start, int before, int count) {


 }



		public void afterTextChanged(Editable arg0) {
// 文字改变后出发事件
			View editText = findViewById(R.id.passwd);
			View button = findViewById(R.id.button);
			String content = editText.getViewTreeObserver().toString();
			//若输入框内容为空按钮可点击，字体为蓝色

			if (!content.isEmpty()) {

				button.setEnabled(true);
			} else {

				button.setEnabled(false);
			}

		}
	};
}

