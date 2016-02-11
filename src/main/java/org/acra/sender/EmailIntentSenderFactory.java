package org.acra.sender;

import android.content.Context;
import android.support.annotation.NonNull;

import org.acra.config.ACRAConfiguration;

/**
 * Constructs an {@link EmailIntentSender}.
 */
public final class EmailIntentSenderFactory implements ReportSenderFactory {

    @NonNull
    @Override
    public ReportSender create(Context context, ACRAConfiguration config) {
        return new EmailIntentSender(context, config);
    }
}
