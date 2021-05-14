defmodule Kata do
  def reverse_words(words) do
    str |> String.split() |> Enum.reverse() |> Enum.join(" ")
  end
end
