package androidx.navigation.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.annotation.StringRes;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ActivityChooserModel;
import ck.p;
import com.safedk.android.utils.i;
import kotlin.Metadata;

/* JADX INFO: compiled from: ActionBarOnDestinationChangedListener.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u001c\u0010\n\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\t\u001a\u00020\bH\u0014R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Landroidx/navigation/ui/ActionBarOnDestinationChangedListener;", "Landroidx/navigation/ui/AbstractAppBarOnDestinationChangedListener;", "", "title", "Lmj/r;", "setTitle", "Landroid/graphics/drawable/Drawable;", "icon", "", "contentDescription", "setNavigationIcon", "Landroidx/appcompat/app/AppCompatActivity;", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "Landroidx/appcompat/app/AppCompatActivity;", "Landroidx/navigation/ui/AppBarConfiguration;", i.f44984c, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;Landroidx/navigation/ui/AppBarConfiguration;)V", "navigation-ui_release"}, k = 1, mv = {1, 6, 0})
public final class ActionBarOnDestinationChangedListener extends AbstractAppBarOnDestinationChangedListener {
    private final AppCompatActivity activity;

    /* JADX WARN: Illegal instructions before constructor call */
    public ActionBarOnDestinationChangedListener(AppCompatActivity appCompatActivity, AppBarConfiguration appBarConfiguration) {
        p.j(appCompatActivity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        p.j(appBarConfiguration, i.f44984c);
        ActionBarDrawerToggle.Delegate drawerToggleDelegate = appCompatActivity.getDrawerToggleDelegate();
        if (drawerToggleDelegate != null) {
            Context actionBarThemedContext = drawerToggleDelegate.getActionBarThemedContext();
            p.i(actionBarThemedContext, "checkNotNull(activity.dr… }.actionBarThemedContext");
            super(actionBarThemedContext, appBarConfiguration);
            this.activity = appCompatActivity;
            return;
        }
        throw new IllegalStateException(("Activity " + appCompatActivity + " does not have an DrawerToggleDelegate set").toString());
    }

    @Override // androidx.navigation.ui.AbstractAppBarOnDestinationChangedListener
    public void setNavigationIcon(Drawable drawable, @StringRes int i10) {
        ActionBar supportActionBar = this.activity.getSupportActionBar();
        if (supportActionBar == null) {
            throw new IllegalStateException(("Activity " + this.activity + " does not have an ActionBar set via setSupportActionBar()").toString());
        }
        p.i(supportActionBar, "checkNotNull(activity.su…ortActionBar()\"\n        }");
        supportActionBar.setDisplayHomeAsUpEnabled(drawable != null);
        ActionBarDrawerToggle.Delegate drawerToggleDelegate = this.activity.getDrawerToggleDelegate();
        if (drawerToggleDelegate != null) {
            p.i(drawerToggleDelegate, "checkNotNull(activity.dr…leDelegate set\"\n        }");
            drawerToggleDelegate.setActionBarUpIndicator(drawable, i10);
        } else {
            throw new IllegalStateException(("Activity " + this.activity + " does not have an DrawerToggleDelegate set").toString());
        }
    }

    @Override // androidx.navigation.ui.AbstractAppBarOnDestinationChangedListener
    public void setTitle(CharSequence charSequence) {
        ActionBar supportActionBar = this.activity.getSupportActionBar();
        if (supportActionBar != null) {
            p.i(supportActionBar, "checkNotNull(activity.su…ortActionBar()\"\n        }");
            supportActionBar.setTitle(charSequence);
        } else {
            throw new IllegalStateException(("Activity " + this.activity + " does not have an ActionBar set via setSupportActionBar()").toString());
        }
    }
}
