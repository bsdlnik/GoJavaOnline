import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class MusicShop {
    private String name;
    private List<BaseMusicInstrument> instrument = new ArrayList<>();

    public MusicShop(String name, BaseMusicInstrument... instrumentsNames) {
        this.name = name;
        for(BaseMusicInstrument f : instrumentsNames){
            this.instrument.add(f);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BaseMusicInstrument getInstrument(String instrumentName) {
        BaseMusicInstrument tmpInstrumentLink = null;
        for(int i = 0; i < instrument.size(); i++){
            if(instrument.get(i).getName().contains(instrumentName)){
                tmpInstrumentLink = instrument.get(i);
                instrument.remove(i);
                break;
            }
        }
        return tmpInstrumentLink;
    }

    public void setInstruments(BaseMusicInstrument... instrumentsNames) {
        for(BaseMusicInstrument f : instrumentsNames){
            this.instrument.add(f);
        }
    }

    private StringBuilder getInstrumentsInfo(){
        Collection<BaseMusicInstrument> instrumentInfo = instrument;
        Iterator<BaseMusicInstrument>  iter = instrumentInfo.iterator();
        StringBuilder stringBuilder = new StringBuilder();
        while(iter.hasNext()){
            stringBuilder.append("      -").append(iter.next()).append("\n");
        }
        return stringBuilder;
    }



    public String toString() {
        return new  StringBuilder().append("Name of Shop: ").append(getName()).append("\n").append(getInstrumentsInfo()).toString();
    }
}


