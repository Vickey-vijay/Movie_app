package b8;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.R$layout;
import com.luck.picture.lib.R$style;

/* JADX INFO: compiled from: PictureCommonDialog.java */
/* JADX INFO: loaded from: classes9.dex */
public class b extends Dialog implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f5293b;

    /* JADX INFO: compiled from: PictureCommonDialog.java */
    public interface a {
        void a();
    }

    public b(Context context, String str, String str2) {
        super(context, R$style.Picture_Theme_Dialog);
        setContentView(R$layout.ps_common_dialog);
        Button button = (Button) findViewById(R$id.btn_cancel);
        Button button2 = (Button) findViewById(R$id.btn_commit);
        TextView textView = (TextView) findViewById(R$id.tvTitle);
        TextView textView2 = (TextView) findViewById(R$id.tv_content);
        textView.setText(str);
        textView2.setText(str2);
        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        a();
    }

    public static b c(Context context, String str, String str2) {
        b bVar = new b(context, str, str2);
        bVar.show();
        return bVar;
    }

    public void b(a aVar) {
        this.f5293b = aVar;
    }

    public final void a() {
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -2;
        attributes.height = -2;
        attributes.gravity = 17;
        getWindow().setWindowAnimations(R$style.PictureThemeDialogWindowStyle);
        getWindow().setAttributes(attributes);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R$id.btn_cancel) {
            dismiss();
            return;
        }
        if (id2 == R$id.btn_commit) {
            dismiss();
            a aVar = this.f5293b;
            if (aVar != null) {
                aVar.a();
            }
        }
    }
}
