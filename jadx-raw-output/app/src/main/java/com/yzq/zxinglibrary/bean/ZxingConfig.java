package com.yzq.zxinglibrary.bean;

import androidx.annotation.ColorRes;
import com.yzq.zxinglibrary.R$color;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class ZxingConfig implements Serializable {
    private boolean isPlayBeep = true;
    private boolean isShake = true;
    private boolean isShowbottomLayout = true;
    private boolean isShowFlashLight = true;
    private boolean isShowAlbum = true;
    private boolean isDecodeBarCode = true;
    private boolean isFullScreenScan = true;

    @ColorRes
    private int reactColor = R$color.react;

    @ColorRes
    private int frameLineColor = -1;

    @ColorRes
    private int scanLineColor = R$color.scanLineColor;

    public int getFrameLineColor() {
        return this.frameLineColor;
    }

    public int getReactColor() {
        return this.reactColor;
    }

    public int getScanLineColor() {
        return this.scanLineColor;
    }

    public boolean isDecodeBarCode() {
        return this.isDecodeBarCode;
    }

    public boolean isFullScreenScan() {
        return this.isFullScreenScan;
    }

    public boolean isPlayBeep() {
        return this.isPlayBeep;
    }

    public boolean isShake() {
        return this.isShake;
    }

    public boolean isShowAlbum() {
        return this.isShowAlbum;
    }

    public boolean isShowFlashLight() {
        return this.isShowFlashLight;
    }

    public boolean isShowbottomLayout() {
        return this.isShowbottomLayout;
    }

    public void setDecodeBarCode(boolean z10) {
        this.isDecodeBarCode = z10;
    }

    public void setFrameLineColor(@ColorRes int i10) {
        this.frameLineColor = i10;
    }

    public void setFullScreenScan(boolean z10) {
        this.isFullScreenScan = z10;
    }

    public void setPlayBeep(boolean z10) {
        this.isPlayBeep = z10;
    }

    public void setReactColor(@ColorRes int i10) {
        this.reactColor = i10;
    }

    public void setScanLineColor(@ColorRes int i10) {
        this.scanLineColor = i10;
    }

    public void setShake(boolean z10) {
        this.isShake = z10;
    }

    public void setShowAlbum(boolean z10) {
        this.isShowAlbum = z10;
    }

    public void setShowFlashLight(boolean z10) {
        this.isShowFlashLight = z10;
    }

    public void setShowbottomLayout(boolean z10) {
        this.isShowbottomLayout = z10;
    }
}
