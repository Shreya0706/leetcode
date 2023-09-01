class Solution {
    public String frequencySort(String s) {
        class CharFrequency {
            char character;
            int frequency;
            
            CharFrequency(char character, int frequency) {
                this.character = character;
                this.frequency = frequency;
            }
        }
        List<CharFrequency> charFrequencies = new ArrayList<>();
        for (char c : s.toCharArray()) {
            boolean found = false;
            for (CharFrequency cf : charFrequencies) {
                if (cf.character == c) {
                    cf.frequency++;
                    found = true;
                    break;
                }
            }
            if (!found) {
                charFrequencies.add(new CharFrequency(c, 1));
            }
        }
        charFrequencies.sort((a, b) -> b.frequency - a.frequency);
        
        StringBuilder sortedString = new StringBuilder();
        for (CharFrequency cf : charFrequencies) {
            for (int i = 0; i < cf.frequency; i++) {
                sortedString.append(cf.character);
            }
        }
        
        return sortedString.toString();
        
    }
}