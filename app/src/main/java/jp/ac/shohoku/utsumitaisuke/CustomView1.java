package jp.ac.shohoku.utsumitaisuke;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

import static android.graphics.Color.rgb;

public class CustomView1 extends View {
    public CustomView1(Context context) {
        super(context);
    }

    public CustomView1(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomView1(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    /**
     *このメソッドで描画をします．
     * @param canvas 画像表示用のキャンバス
     */
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        canvas.drawColor(Color.WHITE);

        int w = this.getWidth();
        int h = this.getHeight();
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);  //Styleを設定: 線で描く
        paint.setColor(Color.DKGRAY);  //色を設定
        canvas.drawRect(new Rect(5, 5, w - 10, h - 10), paint);  //長方形を描画

        for(int i = 0; i<10; i++){
            Paint p2 = new Paint();
            p2.setStyle(Paint.Style.FILL);   //Styleを設定 : 塗りつぶす
            p2.setColor(Color.rgb(25*i, 0, 0)); //色を指定
            canvas.drawCircle(25*i+125, 25*i+125, 100,p2);
        }

    }

}
