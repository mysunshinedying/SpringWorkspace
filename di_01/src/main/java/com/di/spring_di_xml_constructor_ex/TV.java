package com.di.spring_di_xml_constructor_ex;

public class TV {
	private Speaker speaker;
	
	public TV(Speaker speakerVolume) {
		this.speaker = speakerVolume;
	}
	
    public void volumeUp() {
    	speaker.volumeUp();
    }
    public void volumeDown() {
    	speaker.volumeDown();
    }
}
