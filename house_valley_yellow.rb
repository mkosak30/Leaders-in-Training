class LeadersInTraining
  # Variables
  @@energy_level = 0
  @@progress_level = 0
  @@mood_level = 0

  # Getters
  def self.energy_level
    @@energy_level
  end

  def self.progress_level
    @@progress_level
  end

  def self.mood_level
    @@mood_level
  end

  # Setters
  def self.energy_level=(new_energy_level)
    @@energy_level = new_energy_level
  end

  def self.progress_level=(new_progress_level)
    @@progress_level = new_progress_level
  end

  def self.mood_level=(new_mood_level)
    @@mood_level = new_mood_level
  end

  # Methods
  def self.update_energy_level(new_value)
    @@energy_level += new_value
    if @@energy_level < 0
      puts "You're feeling really fatigued!"
    elsif @@energy_level == 0
      puts "You're feeling refreshed!"
    else
      puts "You're feeling energized!"
    end
  end

  def self.update_progress_level(new_value)
    @@progress_level += new_value
    if @@progress_level < 0
      puts "You feel like you're going backwards!"
    elsif @@progress_level == 0
      puts "You're feeling steady!"
    else
      puts "You feel like you're making progress!"
    end
  end

  def self.update_mood_level(new_value)
    @@mood_level += new_value
    if @@mood_level < 0
      puts "You're feeling really discouraged!"
    elsif @@mood_level == 0
      puts "You're feeling neutral!"
    else
      puts "You're feeling motivated!"
    end
  end
end