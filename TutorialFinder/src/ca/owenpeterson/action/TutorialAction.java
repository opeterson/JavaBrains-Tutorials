package ca.owenpeterson.action;

import ca.owenpeterson.service.TutorialFinderService;

public class TutorialAction {
	
	private String bestTutorialSite;
	private String language;
	
	public String getTutorial() {
/*		TutorialFinderService tutorialFinderService = new TutorialFinderService();
		setBestTutorialSite(tutorialFinderService.getBestTutorialSite(getLanguage()));*/
		//System.out.println(getLanguage());
		System.out.println("get tutorial called");
		
		return "success";
	}
	
	public String addTutorial() {
/*		TutorialFinderService tutorialFinderService = new TutorialFinderService();
		setBestTutorialSite(tutorialFinderService.getBestTutorialSite(getLanguage()));*/
		//System.out.println(getLanguage());
		System.out.println("add tutorial called");
		
		return "success";
	}
	
	public String someOtherMethod() {
		System.out.println("Some other method executed.");
		return "success";
	}

	public String getBestTutorialSite() {
		return bestTutorialSite;
	}

	public void setBestTutorialSite(String bestTutorialSite) {
		this.bestTutorialSite = bestTutorialSite;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	
	
}
