package Map.SortingOperations.Events;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Random;
import java.util.TreeMap;

public class EventsSchedule {
  private HashMap<LocalDate, Event> events;

  public EventsSchedule() {
    this.events = new HashMap<LocalDate, Event>();
  }

  public void addEvent(LocalDate date, String name, String guest) {
    this.events.put(date, new Event(name, guest));
  }

  public void showSchedule() {
    if (this.events.isEmpty()) {
      throw new RuntimeException("The events list is empty");
    }

    TreeMap<LocalDate, Event> sortedEvents = new TreeMap<LocalDate, Event>(this.events);

    System.out.println("Events: ");
    for (LocalDate date : sortedEvents.keySet()) {
      System.out.println(date + ": " + sortedEvents.get(date).getName() + " - " + sortedEvents.get(date).getGuest());
    }
  }

  public void showNextEvent() {
    if (this.events.isEmpty()) {
      throw new RuntimeException("The events list is empty");
    }

    TreeMap<LocalDate, Event> sortedEvents = new TreeMap<LocalDate, Event>(this.events);

    System.out.println("Next event: ");

    for (LocalDate date : sortedEvents.keySet()) {
      if (date.isAfter(LocalDate.now())) {
        System.out.println(date + ": " + sortedEvents.get(date).getName() + " - " + sortedEvents.get(date).getGuest());
        break;
      }
    }
  }

  public static void main(String[] args) {
    EventsSchedule eventsSchedule = new EventsSchedule();
    Random random = new Random();

    String[] eventNames = { "Coachella", "Lollapalooza", "Burning Man", "Tomorrowland", "Glastonbury", "Woodstock",
        "Ultra Music Festival", "Electric Daisy Carnival", "Rock in Rio", "Reading and Leeds Festival",
        "Sziget Festival", "Roskilde Festival", "Primavera Sound", "Exit Festival", "Mysteryland", "Download Festival",
        "Wacken Open Air", "Hellfest", "Graspop Metal Meeting", "Metallica By Request" };

    String[] guestNames = { "Beyoncé", "Kanye West", "Lady Gaga", "Drake", "Ariana Grande", "Ed Sheeran",
        "Taylor Swift", "Justin Bieber", "Rihanna", "Bruno Mars", "Kendrick Lamar", "The Weeknd", "Post Malone",
        "Billie Eilish", "Travis Scott", "Harry Styles", "Dua Lipa", "Shawn Mendes", "Lizzo", "Cardi B" };

    for (int i = 0; i < 20; i++) {
      int randomEventIndex = random.nextInt(eventNames.length);
      int randomGuestIndex = random.nextInt(guestNames.length);
      eventsSchedule
          .addEvent(LocalDate.of(2023, 8, i + 1),
              eventNames[randomEventIndex],
              guestNames[randomGuestIndex]);
    }

    eventsSchedule.showSchedule();
    eventsSchedule.showNextEvent();
  }
}
