package androidx.navigation.ui;

import androidx.navigation.NavController;
import ck.p;
import com.google.android.material.navigation.NavigationView;
import kotlin.Metadata;

/* JADX INFO: compiled from: NavigationView.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0005"}, d2 = {"Lcom/google/android/material/navigation/NavigationView;", "Landroidx/navigation/NavController;", "navController", "Lmj/r;", "setupWithNavController", "navigation-ui_release"}, k = 2, mv = {1, 6, 0})
public final class NavigationViewKt {
    public static final void setupWithNavController(NavigationView navigationView, NavController navController) {
        p.j(navigationView, "<this>");
        p.j(navController, "navController");
        NavigationUI.setupWithNavController(navigationView, navController);
    }
}
