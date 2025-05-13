#!/bin/bash

# Constants
ZIP_URL="https://github.com/f1db/f1db/releases/latest/download/f1db-sqlite.zip"
ZIP_FILE="f1db-sqlite.zip"
DB_FILE="f1db.db"

echo "📥 Downloading $ZIP_FILE from f1db..."
curl -L -o "$ZIP_FILE" "$ZIP_URL"

if [ $? -ne 0 ]; then
    echo "❌ Failed to download $ZIP_FILE"
    exit 1
fi

echo "📦 Extracting $ZIP_FILE..."
unzip -o "$ZIP_FILE"

if [ ! -f "$DB_FILE" ]; then
    echo "❌ $DB_FILE not found after extraction."
    exit 1
fi

echo "📁 Moving $DB_FILE to project root..."
mv -f "$DB_FILE" ./f1db.db

echo "🧹 Cleaning up..."
rm -f "$ZIP_FILE"

echo "✅ Setup complete. SQLite DB is now available as ./f1db.db"
