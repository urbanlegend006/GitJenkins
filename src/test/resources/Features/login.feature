Feature: Play a music video in youtube

  Background: The user has opened a browser
    Given YouTube home is displayed

  Scenario: User can serach a video and play it.
    Given User is at the page "https://www.youtube.com/"
    When user search for "Kya Mujhe Pyaar hain hindi song"
    And user clicks onsearch button
    Then Check the first video is contains the string "Kya Mujhe Pyaar hai"
    And click on the video
