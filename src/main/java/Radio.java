public class Radio {

    private int stationsCount = 30;

    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentStation;
    private int currentVolume = minVolume;

    public Radio (int stationsCount) {
        this.stationsCount = stationsCount;
    }

    public Radio () {
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation >= stationsCount) {
            return;
        }
            currentStation = newCurrentStation;


    }

    public void nextStation() {
        if (currentStation == stationsCount - 1) {
            currentStation = 0;
        }
        else {
            currentStation = currentStation + 1;
        }
    }

    public void previousStation() {
        if (currentStation == 0) {
            currentStation = stationsCount - 1;
        }
        else {
            currentStation = currentStation - 1;
        }
    }



    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            return;
        }
        if (newCurrentVolume < minVolume) {
            return;
        }
            currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }


}
