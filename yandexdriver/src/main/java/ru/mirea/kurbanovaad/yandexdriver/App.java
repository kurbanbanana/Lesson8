package ru.mirea.kurbanovaad.yandexdriver;

import android.app.Application;
import com.yandex.mapkit.MapKitFactory;


public class App extends Application {
    private final String MAPKIT_API_KEY = "3076afaf-2948-460f-b545-a1e407394d48";
    @Override
    public void onCreate() {
        super.onCreate();
        // Set the api key before calling initialize on MapKitFactory.
        MapKitFactory.setApiKey(MAPKIT_API_KEY);
    }
}