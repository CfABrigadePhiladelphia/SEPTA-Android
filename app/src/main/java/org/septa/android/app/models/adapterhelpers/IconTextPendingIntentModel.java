/*
 * IconTextPendingIntentModel.java
 * Last modified on 02-09-2014 20:40-0500 by brianhmayo
 *
 * Copyright (c) 2014 SEPTA.  All rights reserved.
 */

package org.septa.android.app.models.adapterhelpers;

import android.app.PendingIntent;

public class IconTextPendingIntentModel {
    private String text;
    private String iconImageNameBase;
    private String iconImageNameSuffix;
    private PendingIntent pendingIntent;
    private boolean enabled;

    public IconTextPendingIntentModel(String text, String iconImageNameBase, String iconImageNameSuffix, PendingIntent pendingIntent, boolean enabled) {
        this.text = text;
        this.iconImageNameBase = iconImageNameBase;
        this.iconImageNameSuffix = iconImageNameSuffix;
        this.pendingIntent = pendingIntent;
        this.enabled = enabled;
    }

    public String getText() {

        return this.text;
    }

    public String getIconImageNameBase() { return this.iconImageNameBase; }

    public String getIconImageNameSuffix() {



        return this.iconImageNameSuffix;
    }

    public PendingIntent getPendingIntent() { return this.pendingIntent; }

    public boolean isEnabled() { return this.enabled; }
}
