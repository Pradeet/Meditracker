package com.kumbhthon.meditracker;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;

public class MainWidget extends AppWidgetProvider 
{
	private static String ACTION_SMS_CALL = "Call_Sms";
	private RemoteViews remoteViews;
	public AppWidgetManager appWidgetManager;	
	
	@Override
	public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) 
	{
		RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_layout);
		Intent configIntent = new Intent(context, TransperentActivity.class);
		configIntent.setAction(ACTION_SMS_CALL);

		PendingIntent actionPendingIntent = PendingIntent.getActivity(context, 0, configIntent, 0);
		remoteViews.setOnClickPendingIntent(R.id.sos, actionPendingIntent);		
		
		appWidgetManager.updateAppWidget(appWidgetIds, remoteViews);
	}
	
	@Override
	public void onReceive(Context context, Intent intent) 
	{
		super.onReceive(context, intent);
		final String action = intent.getAction();
		
		if(remoteViews == null)
		{
			remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_layout);
		}

		if (AppWidgetManager.ACTION_APPWIDGET_DELETED.equals(action)) 
		{
			final int appWidgetId = intent.getExtras().getInt(
					AppWidgetManager.EXTRA_APPWIDGET_ID,
					AppWidgetManager.INVALID_APPWIDGET_ID);
			if (appWidgetId != AppWidgetManager.INVALID_APPWIDGET_ID) 
			{
				this.onDeleted(context, new int[] { appWidgetId });
			}
		} 
		else 
		{
			
		}
	}		
	
}
