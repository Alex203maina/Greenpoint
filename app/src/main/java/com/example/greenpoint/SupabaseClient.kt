package com.example.greenpoint

import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.postgrest.Postgrest

val supabase = createSupabaseClient(
  supabaseUrl = "https://aurqhdftysrhztyfytdx.supabase.co",
  supabaseKey = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6ImF1cnFoZGZ0eXNyaHp0eWZ5dGR4Iiwicm9sZSI6ImFub24iLCJpYXQiOjE3NTg3MDY3MTMsImV4cCI6MjA3NDI4MjcxM30.v2bRpiHsL7KYx7iZmyOLTcZFb8QBJipk2dy8VaUSBNE"
) {
  install(Postgrest)
}
