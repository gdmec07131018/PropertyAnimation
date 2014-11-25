package cn.edu.gdmec.s07131018.propertyanimation;

import cn.edu.gdmec.s07131018.viewanimation.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends Activity {
	private TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tv = (TextView) findViewById(R.id.tv);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	public void rotate(View view){
		Animator animator = AnimatorInflater.loadAnimator(this,R.animator.myrotate);
		animator.setTarget(tv);
		animator.start();
	}
	public void alpha(View view){
		Animator animator = AnimatorInflater.loadAnimator(this,R.animator.myalpha);
		animator.setTarget(tv);
		animator.start();
	}
	public void scale(View view){
		Animator animator = AnimatorInflater.loadAnimator(this,R.animator.myscale);
		animator.setTarget(tv);
		animator.start();
	}
	public void translate(View view){
		Animator animator = AnimatorInflater.loadAnimator(this,R.animator.mytranslate);
		animator.setTarget(tv);
		animator.start();
	}
	public void set(View view){
		AnimatorSet animatorSet = new AnimatorSet();
		Animator myrotate = AnimatorInflater.loadAnimator(this,R.animator.myrotate);
		Animator mytranslate = AnimatorInflater.loadAnimator(this,R.animator.mytranslate);
		Animator myalpha = AnimatorInflater.loadAnimator(this,R.animator.myalpha);
		
		animatorSet.play(myalpha).after(myrotate).with(mytranslate);
		animatorSet.setTarget(tv);
		animatorSet.start();
		
	}
	
}
