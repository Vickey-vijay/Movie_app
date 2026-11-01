package b;

import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.yk.e.activity.GameActivity;
import com.yk.e.util.StringUtil;

/* JADX INFO: loaded from: classes6.dex */
public final class u implements View.OnTouchListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GameActivity f4738b;

    public u(GameActivity gameActivity) {
        this.f4738b = gameActivity;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    return false;
                }
                float x10 = motionEvent.getX() - this.f4738b.f3292L11I;
                float y10 = motionEvent.getY();
                GameActivity gameActivity = this.f4738b;
                float f10 = y10 - gameActivity.f3296il;
                float x11 = gameActivity.f3290IiL.getX();
                float y11 = this.f4738b.f3290IiL.getY();
                int width = this.f4738b.f3290IiL.getWidth();
                int height = this.f4738b.f3290IiL.getHeight();
                float f11 = x11 + x10;
                float f12 = height + f11;
                GameActivity gameActivity2 = this.f4738b;
                int i10 = gameActivity2.f3291Ll1;
                if (f12 > i10) {
                    gameActivity2.f3290IiL.setX(i10 - height);
                } else if (f11 <= 0.0f) {
                    gameActivity2.f3290IiL.setX(0.0f);
                } else {
                    gameActivity2.f3290IiL.setX(f11);
                }
                float f13 = y11 + f10;
                float f14 = width + f13;
                GameActivity gameActivity3 = this.f4738b;
                int i11 = gameActivity3.f3294lIiI;
                if (f14 > i11) {
                    gameActivity3.f3290IiL.setY(i11 - width);
                } else if (f13 <= 0.0f) {
                    gameActivity3.f3290IiL.setY(0.0f);
                } else {
                    gameActivity3.f3290IiL.setY(f13);
                }
                return true;
            }
            float x12 = this.f4738b.f3290IiL.getX();
            float x13 = this.f4738b.f3290IiL.getX();
            GameActivity gameActivity4 = this.f4738b;
            float x14 = gameActivity4.f3291Ll1 - gameActivity4.f3290IiL.getX();
            float y12 = this.f4738b.f3290IiL.getY();
            GameActivity gameActivity5 = this.f4738b;
            float y13 = gameActivity5.f3294lIiI - gameActivity5.f3290IiL.getY();
            if (x13 > x14) {
                x13 = x14;
            }
            if (y12 > y13) {
                y12 = y13;
            }
            if (x13 < y12) {
                if (x13 == x14) {
                    GameActivity gameActivity6 = this.f4738b;
                    ImageView imageView = gameActivity6.f3290IiL;
                    imageView.setX(gameActivity6.f3291Ll1 - imageView.getWidth());
                } else {
                    this.f4738b.f3290IiL.setX(0.0f);
                }
            } else if (y12 == y13) {
                GameActivity gameActivity7 = this.f4738b;
                ImageView imageView2 = gameActivity7.f3290IiL;
                imageView2.setY(gameActivity7.f3294lIiI - imageView2.getHeight());
            } else {
                this.f4738b.f3290IiL.setY(0.0f);
            }
            int iDip2px = StringUtil.dip2px(this.f4738b, 1.0f);
            GameActivity gameActivity8 = this.f4738b;
            float f15 = gameActivity8.ILL;
            float f16 = iDip2px;
            if (f15 <= x12 - f16 || f15 >= x12 + f16) {
                return true;
            }
            GameActivity.IL1Iii(gameActivity8, false);
            return false;
        }
        this.f4738b.f3292L11I = motionEvent.getX();
        this.f4738b.f3296il = motionEvent.getY();
        GameActivity gameActivity9 = this.f4738b;
        gameActivity9.ILL = gameActivity9.f3290IiL.getX();
        return true;
    }
}
